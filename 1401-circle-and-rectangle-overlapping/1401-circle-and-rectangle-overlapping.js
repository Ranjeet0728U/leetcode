/**
 * @param {number} radius
 * @param {number} xCenter
 * @param {number} yCenter
 * @param {number} x1
 * @param {number} y1
 * @param {number} x2
 * @param {number} y2
 * @return {boolean}
 */
var checkOverlap = function(radius, xC, yC, x1, y1, x2, y2) {
    const xClosest = (xC < x1) ? x1 : (xC > x2) ? x2 : xC;
    
    const yClosest = (yC < y1) ? y1 : (yC > y2) ? y2 : yC;


    const distance = (Math.pow ((xC - xClosest), 2) + Math.pow((yC - yClosest), 2));
    radius = radius * radius;
    return distance <= radius;
};