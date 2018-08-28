import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import DetailUser from '@/components/DetailUser'

Vue.use(Router)

// component별 router, history 설정 - react랑 비슷한듯..?
export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/:id',
      name: 'DetailUser',
      component: DetailUser
    }
  ]
})
