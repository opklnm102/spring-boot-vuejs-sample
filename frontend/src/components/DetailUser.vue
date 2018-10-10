<template>
  <div>
    <h1>{{ user.name }} : {{ user.phoneNumber }}</h1>

    <div>
      <limited-textarea class="col-md-9" :rows="3" :max-length="50" placeholder="input plz..."
                        :initial-text="user.name"></limited-textarea>
    </div>

  </div>
</template>

<script>
import LimitedTextarea from './LimitedTextarea'

export default {
  name: 'DetailUser',
  components: {LimitedTextarea},
  data () {
    return {
      user: {
        name: 'default name',
        phoneNumber: ''
      }
    }
  },
  created () {
    var id = this.$route.params.id
    this.$http.get(`/api/users/${id}`)
      .then(resp => {
        this.user = resp.data.response
      })
  }
}
</script>

<style scoped>
</style>
