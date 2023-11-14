/* 
 * Display inside an alert box the formatted content of an array
 * with something like : "index : i -> value" for each item of the array.
 * 
 * parameters: obj: array to display
 * return:  
 */

function displayArray (obj) {
    let out = 'Contenu du tableau :\n\n';
    for (let i in obj) {
        out += "index : " + i + " -> valeur : " + obj[i] + "\n";
    }

    alert(out);
}
