Application.$controller("MainPageController", ["$scope", function ($scope) {
    "use strict";

    /* perform any action with the variables inside this block(on-page-load) */
    $scope.onPageVariablesReady = function () {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. $scope.Variables.staticVariable1.getData()
         */
    };
    
    /* perform any action with widgets inside this block */
    $scope.onPageReady = function () {
        /*
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. $scope.Widgets.byId(), $scope.Widgets.byName()or access widgets by $scope.Widgets.widgetName
         */
    };

}]);










Application.$controller("Table2Grid3Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("Table2Liveform3Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid4Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("DepartmentGrid3Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("DepartmentLiveform2Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);