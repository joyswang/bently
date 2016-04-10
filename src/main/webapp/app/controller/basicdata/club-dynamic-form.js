/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("ClubDynamicFormCtrl", ['$scope','$http',ClubDynamicFormCtrl]);

    function ClubDynamicFormCtrl($scope,$http) {

        $scope.clubDynamic={};

        $scope.saveClubDynamic = function (){
            $http.post("save/clubDynamic",$scope.clubDynamic).then(function(data){
                if(data.data.success){
                    $scope.clubDynamic = data.data.data;
                    $.messager.alert('俱乐部动态','俱乐部动态保存成功!','info');
                }else{
                    $.messager.alert('俱乐部动态','俱乐部动态查询失败，请重新操作!','error');
                }
            });
        }





    }
})();
