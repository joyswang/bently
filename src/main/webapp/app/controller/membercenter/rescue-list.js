/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("RescueCtrl", ['$scope','$http',RescueCtrl]);

    function RescueCtrl($scope,$http) {

        $scope.rescueList=[];
        initList();
        function initList (){
            $http.get("get/rescueList").then(function(data){
                if(data.data.success){
                    $scope.rescueList = data.data.data;
                }else{
                    $.messager.alert('市内救援','市内救援服务查询失败，请重新操作!','error');
                }
            });
        }

        $scope.handle = function(wechatid){
            $http.get('handle/rescue?wechatid='+wechatid).then(function(data){
                if(data.data.success){
                    $.messager.alert('市内救援服务','市内救援服务操作成功!','info');
                    initList();
                }else{
                    $.messager.alert('市内救援服务',data.data.msg,'error');
                }
            });
        }




    }
})();
