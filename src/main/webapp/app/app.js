'use strict';

// Declare app level module which depends on views, and components
angular.module('jtdscs', [
  'ngRoute',
    'jtdscs.route',
    'jtdscs.controller'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.otherwise({redirectTo: '/'});
}]);
angular.module('jtdscs.controller',[]);
angular.module('jtdscs.route',['ngRoute']);
angular.module('jtdscs.service',[]);
angular.module('jtdscs.resource',[]);

