import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdmintrackbookComponent } from './admintrackbook.component';

describe('AdmintrackbookComponent', () => {
  let component: AdmintrackbookComponent;
  let fixture: ComponentFixture<AdmintrackbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdmintrackbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdmintrackbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
