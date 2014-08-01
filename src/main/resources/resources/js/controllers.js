'use strict';

/* Controllers */
angular.module('myApp.controllers', [])
  .controller('IndexCtrl', ['$scope', function($scope) {
      $scope.now = new Date();
  }])
  .controller('Page1Ctrl', ['$scope', '$http', function($scope, $http) {
      $http.get('api/date/now').success(function(data) {
        $scope.nowFromServer = new Date(parseInt(data));
      });
  }])
  .controller('Page2Ctrl', ['$scope', '$http', function($scope, $http) {
      $http.get('api/test_entities/3').success(function(data) {
        $scope.entity3 = data;
      });
  }])
  .controller('Page3Ctrl', ['$scope', '$http', function($scope, $http) {
      $http.get('api/test_entities').success(function(data) {
        $scope.entities = data;
      });
  }])
;
