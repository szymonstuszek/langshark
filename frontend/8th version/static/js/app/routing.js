angular.module('app', ['ngRoute'])
.config(function($routeProvider){
    $routeProvider
    .when('/badges', {
        templateUrl: 'partials/badges.html',
        controller: null,
        controllerAs: null,
    })
    
})