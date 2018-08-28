<template>
  <div id="app">
    <!--<img src="./assets/logo.png">-->
    <!-- static 폴더의 sodyddms build에 포함된다 -->
    <img src="/static/images/logo2.png">

    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
