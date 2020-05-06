import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallsanctionedComponent } from './getallsanctioned.component';

describe('GetallsanctionedComponent', () => {
  let component: GetallsanctionedComponent;
  let fixture: ComponentFixture<GetallsanctionedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetallsanctionedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetallsanctionedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
