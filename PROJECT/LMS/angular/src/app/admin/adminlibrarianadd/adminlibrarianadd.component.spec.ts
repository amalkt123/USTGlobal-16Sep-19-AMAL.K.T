import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminlibrarianaddComponent } from './adminlibrarianadd.component';

describe('AdminlibrarianaddComponent', () => {
  let component: AdminlibrarianaddComponent;
  let fixture: ComponentFixture<AdminlibrarianaddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminlibrarianaddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminlibrarianaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
