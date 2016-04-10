/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("HotelDestineCtrl", ['$scope','$http',HotelDestineCtrl]);

    function HotelDestineCtrl($scope,$http) {

        $scope.hotelDestineList=[];
        initList();
        function initList (){
            $http.get("get/hotelList").then(function(data){
                if(data.data.success){
                    $scope.hotelDestineList = data.data.data;
                }else{
                    $.messager.alert('酒店预订','酒店预订查询失败，请重新操作!','error');
                }
            });
        }

        $scope.handle = function(wechatid){
            $http.get('handle/hotel?wechatid='+wechatid).then(function(data){
                if(data.data.success){
                    $.messager.alert('酒店预订','酒店预订处理成功!','info');
                    initList();
                }else{
                    $.messager.alert('酒店预订','酒店预订处理失败，请重新操作!','info');
                }
            });
        }




    }
})();
