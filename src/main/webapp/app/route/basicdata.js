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
        }).when('/basicdata/clubactivity',{
            templateUrl : '/app/view/basicdata/club-activity-list.html'
        }).when('/basicdata/clubActivityEdit/:id',{
            templateUrl : '/app/view/basicdata/club-activity-edit.html'
        }).when('/basicdata/clubActivityForm',{
            templateUrl : '/app/view/basicdata/club-activity-form.html'
        }).when('/destine/hotelDestineList',{
            templateUrl : '/app/view/destine/hotel-destine-list.html'
        }).when('/destine/yachtDestineList',{
            templateUrl : '/app/view/destine/yacht-destine-list.html'
        }).when('/destine/activityDestineList',{
            templateUrl : '/app/view/destine/activity-destine-list.html'
        }).when('/membercenter/washCarList',{
            templateUrl : '/app/view/membercenter/washcar-list.html'
        }).when('/membercenter/waxingList',{
            templateUrl : '/app/view/membercenter/waxing-list.html'
        }).when('/membercenter/maintenanceList',{
            templateUrl : '/app/view/membercenter/maintenance-list.html'
        }).when('/membercenter/rescueList',{
            templateUrl : '/app/view/membercenter/rescue-list.html'
        }).when('/membercenter/memberList',{
            templateUrl : '/app/view/membercenter/member-manager-list.html'
        }).when('/membercenter/memberEdit/:id',{
            templateUrl : '/app/view/membercenter/member-edit.html'
        });
    }]);