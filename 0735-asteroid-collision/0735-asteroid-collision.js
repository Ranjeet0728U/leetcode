var asteroidCollision = function(asteroids) {
    const arr = [];

    asteroids.forEach(ele =>{
        let isDestroyed = false;

        while(arr.length != 0 
            && arr[arr.length - 1] > 0 
            && ele < 0
            ){

            if(arr[arr.length - 1] < -ele){
                arr.pop();
            }else if(arr[arr.length - 1] == -ele){
                arr.pop();
                isDestroyed = true;
                break;
            }else{
                isDestroyed = true;
                break;
            }
        }
        if(!isDestroyed){
            arr.push(ele);
        }
    });

    return arr;
};