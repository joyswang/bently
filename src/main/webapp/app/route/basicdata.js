/**
 * Created by liangwang on 4/6/16.
 */

angular.module('jtdscs.route')
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/basicdata/shipcompany', {
            templateUrl: 'view/basicdata/shipcompany.html'
        });
    }]);