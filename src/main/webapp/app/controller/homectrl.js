/**
 * Created by liangwang on 4/6/16.
 */
"use strict";
(function () {
    var app = angular.module('jtdscs.controller');
    app.controller('HomeCtrl', HomeCtrl);
    function HomeCtrl() {
        var self = this;
        self.username = "未登录";
        self.login = function () {
            self.username = "测试用户";

        };
        self.logout = function () {
            self.username = "未登录";
        }
    }
})();