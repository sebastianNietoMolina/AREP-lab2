var appClient = ( function (){

   function getMean(data, callback){
        var list = JSON.stringify(data);
        var Promise = $.ajax({
            url: "/mean",
            type: 'POST',
            data: list,
            contentType: "application/json"
        });
        Promise.then(
            function (answer) {
                console.info("OK");
                callback(answer);
            }
        );
    }

    function getStd(data, callback){
            var list = JSON.stringify(data);
            var Promise = $.ajax({
                url: "/standardDeviation",
                type: 'POST',
                data: list,
                contentType: "application/json"
            });
            Promise.then(
                function (answer) {
                    console.info("OK");
                    callback(answer);
                }
            );
        }

    return{
        getMean: getMean,
        getStd: getStd
    }
})();