'use strict';

define(['./module', 'lodash'], function(module, _) {
    module.directive('loginAvatar', ['$window', 'UserService' ,function($window, UserService) {
        return {
            restrict: 'E',
            templateUrl: '/pages/templates/login-avatar.html',
            link: function(scope) {
                UserService.currentUser().then(function(data) {
                    scope.user = data;
                    var menus = UserService.menus(scope.user.roleList, scope.user.superUser);
                    if (!_.chain(menus).values().contains(true).value()) {
                        $window.location.href = '/403.html';
                        return;
                    }
                    scope.user.menus = menus;
                });

                scope.logout = function() {
                    UserService.logout();
                };
            }
        };
    }]);
});