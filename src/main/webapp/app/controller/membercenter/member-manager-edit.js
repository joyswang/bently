/**
 * Created by liangwang on 4/6/16.
 */
"use strict";

(function () {
    var app = angular.module('jtdscs.controller');
    app.controller("MemberEditCtrl", ['$scope','$http','$routeParams',MemberEditCtrl]);

    function MemberEditCtrl($scope,$http,$routeParams) {

        $scope.member={};

        $scope.radioArray =[
            {
                code:1,
                name:'是'

            },
            {
                code:0,
                name:'否'
            }];
        $http.get("get/member?id="+$routeParams.id).then(function(data){
            if(data.data.success){
                $scope.member = data.data.data;
            }else{
                $.messager.alert('会员信息','会员信息查询失败，请重新操作!','error');
            }
        });

        $scope.updateMember = function(){
            $http.post('update/member',$scope.member).then(function(data){
                if(data.data.success){
                    $scope.member = data.data.data;
                    $.messager.alert('会员信息','会员信息更新成功!','info');
                }else{
                    $.messager.alert('会员信息','会员信息更新失败，请重新操作!','error');
                }
            });
        }
    }
})();
