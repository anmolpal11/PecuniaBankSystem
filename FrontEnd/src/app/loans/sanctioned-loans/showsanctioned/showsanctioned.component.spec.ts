import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowsanctionedComponent } from './showsanctioned.component';

describe('ShowsanctionedComponent', () => {
  let component: ShowsanctionedComponent;
  let fixture: ComponentFixture<ShowsanctionedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowsanctionedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowsanctionedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
