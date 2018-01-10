demo.factory('demoListCache', ["$cacheFactory",function($cacheFactory) {
	return $cacheFactory('demoListCache');
}]);

demo.factory('cacheService', ["demoListCache",function(cache) {
	return {
		getObj : function(key){
			return cache.get(key);
		},
		putObj : function(key,value){
			cache.put(key,value);
		},
		isObjExists : function(key){
			return cache.get(key)?true:false;
		},
		getCacheInfo : function(){
			return cache.info();
		}
	};
}]);

demo.directive('opacity', opacity);
function opacity($timeout) {
    return {
        link: function (scope, element, attrs) {
            var value = attrs.opacity;
            $timeout(function () {
                element[0].style.opacity = value;
            },50);
            closeLoadingDiv();
        }
    }
}

demo.directive('emitLastRepeaterElement',["$timeout", function($timeout) {
	return {
	link: function(scope) {
			var index = scope.$index;
			if(scope.d.firstTimeLoad) {
				if(scope.$last) {
            		
            	}
			} else if (scope.d.error) {
				if(isEmpty(scope.che.isError)){
					$timeout(function () {
    				  
					}, 0);
    		      } else {
    		    	$timeout(function () {
    		    	  
    		    	},0);
    		      }
				
				if(scope.$last && !isEmpty(scope.d.indexToFocus)) {
					$timeout(function () {
					  focusDiv(scope.d.indexToFocus, $timeout);
					},0);
				}
			} else if(scope.d.chemicalAddedRemoved) {
				if(isEmpty(scope.che.isNewAdded)) {
            		hideAllCollapseDivs(scope.d);
				} else {
					scope.che.isNewAdded = null;
					openCheDiv(index,scope.che,"");
				}
			} else {
				hideAllCollapseDivs(scope.d);
			}
  }
	}
	

	
}]);
