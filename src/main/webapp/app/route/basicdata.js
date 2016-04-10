/**
 * Created by liangwang on 4/6/16.
 */

angular.module('jtdscs.route')
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/basicdata/shipcompany', {
            templateUrl: '/app/view/basicdata/shipcompany.html'
        }).when('/basicdata/clubdynamic',{
            templateUrl : '/app/view/basicdata/club-dynamic-list.html'
        }).when('/basicdata/clubdynamicEdit/:id',{
            templateUrl : '/app/view/basicdata/club-dynamic-edit.html'
        }).when('/basicdata/clubdynamicForm',{
            templateUrl : '/app/view/basicdata/club-dynamic-form.html'
        });
    }]);