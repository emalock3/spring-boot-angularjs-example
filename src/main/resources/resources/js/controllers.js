'use strict';

/* Controllers */
angular.module('myApp.controllers', [])
  .controller('IndexCtrl', ['$scope', function($scope) {
      $scope.now = new Date();
  }])
  .controller('Page1Ctrl', ['$scope', function($scope) {
      $scope.now1 = new Date();
  }])
;
