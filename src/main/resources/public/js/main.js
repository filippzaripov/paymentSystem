var app = angular.module("mainPage", []);

app.controller("AppCtrl", function($scope, $http){

    $scope.payments = [/*{
        id : "1",
        customer: "filipp",
        biller: "biller",
        account: "account",
        amount: "amount"

    }*/];
    $http({
        method: 'GET',
        url: 'http://localhost:8080/api/payments'
    }).then(function (response){
        $scope.payments = response;
    },function (error){

    });
});