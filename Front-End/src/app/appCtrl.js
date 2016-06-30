'use strict';

// Declare app level module which depends on views, and components
angular.controller('appCtrl', [
    '$http'
    , function ($locationProvider, $routeProvider) {
        $locationProvider.hashPrefix('!');

        $routeProvider.otherwise({redirectTo: '/view1'});
    }]);
