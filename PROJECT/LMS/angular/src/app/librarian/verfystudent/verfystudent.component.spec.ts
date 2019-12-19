import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VerfystudentComponent } from './verfystudent.component';

describe('VerfystudentComponent', () => {
  let component: VerfystudentComponent;
  let fixture: ComponentFixture<VerfystudentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VerfystudentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VerfystudentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
