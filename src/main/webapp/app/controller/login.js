/**
 * Created by liangwang on 4/6/16.
 */
"use strict";
(function () {
    var app = angular.module('jtdscs.controller');
    app.controller('LoginCtrl', ['$scope','$http',LoginCtrl]);
    function LoginCtrl($scope,$http) {
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

    }
})();