import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentbookComponent } from './studentbook.component';

describe('StudentbookComponent', () => {
  let component: StudentbookComponent;
  let fixture: ComponentFixture<StudentbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
