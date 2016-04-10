/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("WaxingCtrl", ['$scope','$http',WaxingCtrl]);

    function WaxingCtrl($scope,$http) {

        $scope.waxingList=[];
        initList();
        function initList (){
            $http.get("get/waxingList").then(function(data){
                if(data.data.success){
                    $scope.waxingList = data.data.data;
                }else{
                    $.messager.alert('打蜡服务','打蜡服务查询失败，请重新操作!','error');
                }
            });
        }

        $scope.handle = function(wechatid){
            $http.get('handle/waxing?wechatid='+wechatid).then(function(data){
                if(data.data.success){
                    $.messager.alert('打蜡服务','打蜡服务操作成功!','info');
                    initList();
                }else{
                    $.messager.alert('打蜡服务',data.data.msg,'error');
                }
            });
        }




    }
})();
