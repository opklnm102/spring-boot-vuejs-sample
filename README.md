# spring-boot-vuejs-sample

[![JavaScript Style Guide](https://img.shields.io/badge/code_style-standard-brightgreen.svg)](https://standardjs.com)

<br>

## Vue.js project 생성
```sh
## install global vue-cli
$ npm install -g vue-cli

$ vue init webpack frontend
? Project name frontend
? Project description A Vue.js project
? Author Dong Hee kim
? Vue build standalone
? Install vue-router? Yes
? Use ESLint to lint your code? Yes
? Pick an ESLint preset Standard
? Set up unit tests Yes
? Pick a test runner karma
? Setup e2e tests with Nightwatch? Yes
? Should we run `npm install` for you after the project has been created? (recommende
d) npm

   vue-cli · Generated "frontend".
...
```


## npm start for develop
* serve with hot reload
```sh
$ cd front
$ npm start  # or npm run dev
```


## webpack build
* build for production
```sh
$ npm run build
```

* `config/index.js`에 지정된 경로에 build
  * backend project 경로에 build

```js
...
  build: {
    // 2. webpack build config
    // Template for index.html
    index: path.resolve(__dirname, '../../spring-boot-backend/src/main/resources/templates/index.html'),

    // Paths
    assetsRoot: path.resolve(__dirname, '../../spring-boot-backend/src/main/resources/static'),
    assetsSubDirectory: '',
    assetsPublicPath: '/static',

...
```

> #### Refrence
> * [vue.js template webpack](https://vuejs-templates.github.io/webpack/) 
> * [standard](https://github.com/standard/standard/blob/master/docs/README-kokr.md)
> * [WebStorm 2017.1 EAP, 171.2272: Standard code style, completion in package.json](https://blog.jetbrains.com/webstorm/2017/01/webstorm-2017-1-eap-171-2272/)
