/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("ActivityDestineCtrl", ['$scope','$http',HotelDestineCtrl]);

    function HotelDestineCtrl($scope,$http) {

        $scope.activityDestineList=[];
        initList();
        function initList (){
            $http.get("get/activityDestineList").then(function(data){
                if(data.data.success){
                    $scope.activityDestineList = data.data.data;
                }else{
                    $.messager.alert('私人活动预订','私人活动预订查询失败，请重新操作!','error');
                }
            });
        }

        $scope.handle = function(wechatid){
            $http.get('handle/activityDestine?wechatid='+wechatid).then(function(data){
                if(data.data.success){
                    $.messager.alert('私人活动预订','私人活动预订处理成功!','info');
                    initList();
                }else{
                    $.messager.alert('私人活动预订','私人活动预订处理失败，请重新操作!','info');
                }
            });
        }




    }
})();
