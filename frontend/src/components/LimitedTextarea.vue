<template>
    <div>
      <textarea type="text" class="form-control" :rows="rows" :placeholder="placeholder" :maxlength="maxLength" v-model="text"/>
      <p class="text-right text-small text-black-50" v-text="(maxLength - text.length) + ' / ' + maxLength"></p>
    </div>
</template>

<script>
export default {
  name: 'LimitedTextarea',
  data: function () {
    return {
      text: this.initialText
    }
  },
  props: {
    maxLength: {
      type: Number,
      default: 45,
      validator: function (value) {
        return value > 0
      }
    },
    placeholder: {
      type: String
    },
    rows: {
      type: Number,
      default: 1,
      validator: function (value) {
        return value > 0
      }
    },
    initialText: {
      type: String,
      default: ''
    }
  }
}
</script>

<style scoped>
  .text-small {
    font-size: 0.9em;
  }
  .container {
    /*background: #2e2e2e;*/
  }
</style>
