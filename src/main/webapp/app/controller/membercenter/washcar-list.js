/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("WashCarCtrl", ['$scope','$http',WashCarCtrl]);

    function WashCarCtrl($scope,$http) {

        $scope.washCarList=[];
        initList();
        function initList (){
            $http.get("get/washCarList").then(function(data){
                if(data.data.success){
                    $scope.washCarList = data.data.data;
                }else{
                    $.messager.alert('洗车服务','洗车服务查询失败，请重新操作!','error');
                }
            });
        }

        $scope.handle = function(wechatid){
            $http.get('handle/washCar?wechatid='+wechatid).then(function(data){
                if(data.data.success){
                    $.messager.alert('洗车服务','洗车服务操作成功!','info');
                    initList();
                }else{
                    $.messager.alert('洗车服务',data.data.msg,'error');
                }
            });
        }




    }
})();
