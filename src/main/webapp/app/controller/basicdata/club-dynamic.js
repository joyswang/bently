/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("ClubDynamicCtrl", ['$scope','$http',ClubDynamicCtrl]);

    function ClubDynamicCtrl($scope,$http) {

        $scope.clubDynamicList=[];

        $http.get("get/clubDynamicList").then(function(data){
            if(data.data.success){
                $scope.clubDynamicList = data.data.data;
            }else{
                $.messager.alert('俱乐部动态','俱乐部动态查询失败，请重新操作!','error');
            }
        });




    }
})();
