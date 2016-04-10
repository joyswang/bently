/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("ClubActivityFormCtrl", ['$scope','$http',ClubActivityFormCtrl]);

    function ClubActivityFormCtrl($scope,$http) {

        $scope.clubActivity={};

        $scope.saveClubActivity = function (){
            $http.post("save/clubActivity",$scope.clubActivity).then(function(data){
                if(data.data.success){
                    $scope.clubActivity = data.data.data;
                    $.messager.alert('会员活动','会员活动保存成功!','info');
                }else{
                    $.messager.alert('会员活动','会员活动态查询失败，请重新操作!','error');
                }
            });
        }





    }
})();
