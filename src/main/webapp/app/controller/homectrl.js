/**
 * Created by liangwang on 4/6/16.
 */
"use strict";
(function () {
    var app = angular.module('jtdscs.controller');
    app.controller('HomeCtrl', ['$scope','$http',HomeCtrl]);
    function HomeCtrl($scope,$http) {

        $scope.user ={};
        $scope.login = false;
        $http.get("home").then(function(data){
            if(data.data.success){
                $scope.login = true;
                $scope.user = data.data.data;
            }else{
                $scope.login = false;

            }

        });
        $scope.loginMethod = function(){
            $http.post('login',$scope.user).then(function(data){
                if(data.data.success){
                    $scope.user =data.data.data;
                    $scope.login = true;
                    $.messager.alert('用户登入','用户登入成功!','info');
                }else{
                    $.messager.alert('用户登入','用户名或密码错误，请联系管理员!','error');
                }
            });
        };
        var self = this;
        self.username = $scope.user.name;
        self.login = function () {
            self.username = $scope.user.name;

        };
        self.logout = function () {
            $scope.user ={};
            $scope.login = false;
            self.username = "未登录";
        }
    }
})();