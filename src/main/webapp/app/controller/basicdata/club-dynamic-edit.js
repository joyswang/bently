/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("ClubDynamicEditCtrl", ['$scope','$http','$routeParams',ClubDynamicEditCtrl]);

    function ClubDynamicEditCtrl($scope,$http,$routeParams) {

        $scope.clubDynamic={};
        $http.get("get/clubDynamic?id="+$routeParams.id).then(function(data){
            if(data.data.success){
                $scope.clubDynamic = data.data.data;
            }else{
                $.messager.alert('俱乐部动态','俱乐部动态查询失败，请重新操作!','error');
            }
        });

        $scope.updateClubDynamic = function(){
            $http.post('update/clubDynamic',$scope.clubDynamic).then(function(data){
                if(data.data.success()){
                    $scope.clubDynamic = data.data.data;
                    $.messager.alert('俱乐部动态','俱乐部动态更新成功!','info');
                }else{
                    $.messager.alert('俱乐部动态','俱乐部动态更新失败，请重新操作!','error');
                }
            });
        }




    }
})();
