import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HolderdetailsComponent } from './holderdetails.component';

describe('HolderdetailsComponent', () => {
  let component: HolderdetailsComponent;
  let fixture: ComponentFixture<HolderdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HolderdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HolderdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
