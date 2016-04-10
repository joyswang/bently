/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("MemberManagerCtrl", ['$scope','$http',MemberManagerCtrl]);

    function MemberManagerCtrl($scope,$http) {
        $scope.memberList=[];
        $http.get("get/memberList").then(function(data){
            if(data.data.success){
                $scope.memberList = data.data.data;
            }else{
                $.messager.alert('会员用户','会员查询失败，请重新操作!','error');
            }
        });

    }
})();
