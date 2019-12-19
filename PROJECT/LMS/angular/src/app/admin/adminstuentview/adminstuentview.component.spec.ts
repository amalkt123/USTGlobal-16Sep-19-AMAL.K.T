import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminstuentviewComponent } from './adminstuentview.component';

describe('AdminstuentviewComponent', () => {
  let component: AdminstuentviewComponent;
  let fixture: ComponentFixture<AdminstuentviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminstuentviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminstuentviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
