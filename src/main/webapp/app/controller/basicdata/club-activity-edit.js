/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("ClubActivityEditCtrl", ['$scope','$http','$routeParams',ClubActivityEditCtrl]);

    function ClubActivityEditCtrl($scope,$http,$routeParams) {

        $scope.clubActivity={};
        $http.get("get/clubActivity?id="+$routeParams.id).then(function(data){
            if(data.data.success){
                $scope.clubActivity = data.data.data;
            }else{
                $.messager.alert('会员活动','会员活动查询失败，请重新操作!','error');
            }
        });

        $scope.updateClubActivity = function(){
            $http.post('update/clubActivity',$scope.clubActivity).then(function(data){
                if(data.data.success){
                    $scope.clubActivity = data.data.data;
                    $.messager.alert('会员活动','会员活动更新成功!','info');
                }else{
                    $.messager.alert('会员活动','会员活动更新失败，请重新操作!','error');
                }
            });
        }




    }
})();
