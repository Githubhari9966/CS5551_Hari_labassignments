/**
 hari
 */

var app=angular.module("countryapp",[]);
app.controller("countryctrl",function ($scope,$http) {
    $scope.countryg = function () {
        var gen=$scope.country;

        var words = $http.get("http://127.0.0.1:8081/getdata/"+gen)
        words.success(function (data) {
            console.log(data);

            $scope.countrycon={"name":data.body[0].name,"capital":data.body[0].capital,"region":data.body[0].region
            ,"strength":data.body[0].strength,"climate":data.body[0].climate,"temp":data.body[0].temp,
                "pressure":data.body[0].press,"humidity":data.body[0].humidity,
            };
        });
    }
});
