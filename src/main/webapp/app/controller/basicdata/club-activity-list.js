/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("ClubActivityCtrl", ['$scope','$http',ClubActivityCtrl]);

    function ClubActivityCtrl($scope,$http) {

        $scope.clubActivityList=[];

        $http.get("get/activityList").then(function(data){
            if(data.data.success){
                $scope.clubActivityList = data.data.data;
            }else{
                $.messager.alert('会员活动','会员活动查询失败，请重新操作!','error');
            }
        });




    }
})();
