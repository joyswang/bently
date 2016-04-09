/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("ShipCompanyCtrl", ['$scope','$http',ShipCompanyCtrl]);

    function ShipCompanyCtrl($scope,$http) {

        $scope.clubSummary={};

        $http.get("get/summary").then(function(data){
            if(data){
                $scope.clubSummary = data;
            }
        });

        $scope.updateSummary = function(){

            $http.post("update/summary",$scope.clubSummary).then(function(data){
                if(data){
                    $scope.clubSummary = data;
                }else{
                    $.messager.alert('简介保存','简介保存失败，请重新操作!','error');
                }


            });
        }


    }
})();
