/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("MaintenanceCtrl", ['$scope','$http',MaintenanceCtrl]);

    function MaintenanceCtrl($scope,$http) {

        $scope.maintenanceList=[];
        initList();
        function initList (){
            $http.get("get/maintenanceList").then(function(data){
                if(data.data.success){
                    $scope.maintenanceList = data.data.data;
                }else{
                    $.messager.alert('预约保养服务','预约保养服务查询失败，请重新操作!','error');
                }
            });
        }

        $scope.handle = function(wechatid){
            $http.get('handle/maintenance?wechatid='+wechatid).then(function(data){
                if(data.data.success){
                    $.messager.alert('预约保养服务','预约保养服务操作成功!','info');
                    initList();
                }else{
                    $.messager.alert('预约保养服务',data.data.msg,'error');
                }
            });
        }




    }
})();
