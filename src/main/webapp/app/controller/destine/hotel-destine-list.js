/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("HotelDestineCtrl", ['$scope','$http',HotelDestineCtrl]);

    function HotelDestineCtrl($scope,$http) {

        $scope.hotelDestineList=[];

        $http.get("get/hotelDestineList").then(function(data){
            if(data.data.success){
                $scope.hotelDestinelList = data.data.data;
            }else{
                $.messager.alert('酒店预订','酒店预订查询失败，请重新操作!','error');
            }
        });




    }
})();
