import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowallrequestsComponent } from './showallrequests.component';

describe('ShowallrequestsComponent', () => {
  let component: ShowallrequestsComponent;
  let fixture: ComponentFixture<ShowallrequestsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowallrequestsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowallrequestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
