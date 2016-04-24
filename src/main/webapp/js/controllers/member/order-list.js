"use strict";

define(['../module'], function(module) {

    module.controller("ManagerOrderInfoCtrl", ['$scope','$http',function($scope,$http){

        $scope.orderInfoList=[];
        $http.get("get/orderInfoList").then(function(data){
            if(data.data.success){
                $scope.orderInfoList = data.data.data;
            }else{
                $scope.errorMessage ='缴费记录查询失败，请重新操作!';
            }
        });
    }]);

});


