import { AbstractControl, ValidationErrors } from '@angular/forms';

export class CustomValidation{
    constructor(){}
    static unique(control:AbstractControl):ValidationErrors | null{
        console.log(control.value)
        console.log(control.value==='amalkt@gmail.com')
        if(control.value ==='amalkt@gmail.com'){
            return {unique : true};
            }
            else{
                return null;
            }
            // if(control.value.index(' ')>0){
            //     return {unique : true};
            //     }
            //     else{
            //         return null;
            //     }
        
    }
}