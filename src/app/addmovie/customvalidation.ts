import { AbstractControl, ValidationErrors } from "@angular/forms";

export class CustomValidation{
    static unique(control:AbstractControl):ValidationErrors | null{
    console.log(control.value);
    console.log(control.value==="a");
if(control.value==='a'){
    return {unique :true}
}
else{
    return null;
}
    }




    static space(control:AbstractControl):ValidationErrors | null{
        console.log(control.value);
        console.log(control.value===" ");
    if(control.value===' '){
        return {unique :true}
    }
    else{
        return null;
    }
        }
}