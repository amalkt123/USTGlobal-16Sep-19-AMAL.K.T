import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';




@Directive({
    selector:'[custDir]'
})







export class CustomDirective{
    constructor(public e1:ElementRef){
        this.e1.nativeElement.style.backgroundColor="red";
    }
    @HostBinding('style.color') color="blue";
    @HostListener('mouseenter')me(){
        this.e1.nativeElement.style.backgroundColor='green';
    }
    @HostListener('mouseleave')ml(){
        this.e1.nativeElement.style.backgroundColor='yellow';
    }

}