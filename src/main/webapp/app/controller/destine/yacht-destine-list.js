/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("YachtDestineCtrl", ['$scope','$http',HotelDestineCtrl]);

    function HotelDestineCtrl($scope,$http) {

        $scope.yachtDestineList=[];
        initList();
        function initList (){
            $http.get("get/yachtList").then(function(data){
                if(data.data.success){
                    $scope.yachtDestineList = data.data.data;
                }else{
                    $.messager.alert('游艇预订','游艇预订查询失败，请重新操作!','error');
                }
            });
        }

        $scope.handle = function(wechatid){
            $http.get('handle/yacht?wechatid='+wechatid).then(function(data){
                if(data.data.success){
                    $.messager.alert('游艇预订','游艇预订处理成功!','info');
                    initList();
                }else{
                    $.messager.alert('游艇预订','游艇预订处理失败，请重新操作!','info');
                }
            });
        }




    }
})();
