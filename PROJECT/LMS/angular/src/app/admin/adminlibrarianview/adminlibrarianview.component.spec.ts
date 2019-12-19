import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminlibrarianviewComponent } from './adminlibrarianview.component';

describe('AdminlibrarianviewComponent', () => {
  let component: AdminlibrarianviewComponent;
  let fixture: ComponentFixture<AdminlibrarianviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminlibrarianviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminlibrarianviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
